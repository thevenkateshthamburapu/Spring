<html>
<head>
<title>REST Integration Application</title>
</head>

<body>
<h1>Open Your REST Client/POSTMAN and perform below operations</h1>
<h2><u>ADD</u></h2>
<h3>Method :POST <br>URL:http://localhost:8989/SpringREST_01_IntegrationApp/add</h3>
<pre>
{
  "userId":101,
  "userName":"Ravi",
  "email":"ravi@gmail.com",
  "gender":"Male"
}
</pre>
<h2><u>GET</u></h2>
<h3>Method :GET<br>URL:http://localhost:8989/SpringREST_01_IntegrationApp/rest/get?uid=101</h3>
<h2><u>UPDATE</u></h2>
<h3>Method :PUT <br>URL:http://localhost:8989/SpringREST_01_IntegrationApp/rest/update?uid=101</h3>
<h2><u>DELETE</u></h2>
<h3>Method :DELET <br>URL:http://localhost:8989/SpringREST_01_IntegrationApp/rest/delete?uid=101</h3>
</body>
</html>
