var express = require('express');
var app = express();
PORT = process.env.PORT ? process.env.PORT : 8080;

app.get('/', function (req, res) {
  res.send('Hodor.');
});
app.listen(PORT, function () {
  console.log(`Hodor service listening on port ${PORT}!!!`);
});
