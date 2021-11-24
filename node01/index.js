const express = require('express');
const app = express();

//db(mysql) 연결
const db_config = require(__dirname + '/config/database.js');
var conn= db_config.init();
var bodyParser = require('body-parser');

db_config.connect(conn);

app.set('views', __dirname + '/views');
app.set('view engine', 'ejs');

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended : false}));

//Page 연결
app.get('/', function(req, res) { 
    res.send(`<body bgColor="lime">
    <h1>my home</h1>
    <a href="/win">go win</a><br>
    <a href="/write">go write</a><br>
    <a href="/list">go list</a><br>
    </body>`);
});

app.get('/win', function(req, res) { 
    res.send(`<body bgColor="red">
        <h1>I will win</h1>
        <a href="/">go home</a>
        </body>`);
});

app.get('/write', function (req, res) { 
    res.render('write.ejs', {"name":"neoguri"})//넘길거 없으면 {}만, 있으면 {"result":"ok"}
})

app.get('/list', function(req, res) {
    var sql = "select * from board2"
    conn.query(sql, function(err, rows, fields) {
        if(err) console.log('select error');
        else res.render('list.ejs', {'list': rows})
    })
})

app.post('/writeAf', function (req, res) {
    var body = req.body
    console.log('data>>> ' , body); //json

    var sql = "insert into board2 values (?,?,?,now())";
    var params = [body.id, body.title, body.content];
    console.log(sql);
    conn.query(sql, params, function (err) {
        if(err) console.log('query fail!!!!!————')
        else console.log('query success!!!!!————')
    })
    res.redirect('/list')
})


//돌아라 서버
var server = app.listen(3000, function() {
    console.log('server express started!@@@@@');
    console.log('port>>' + server.address().port);
});