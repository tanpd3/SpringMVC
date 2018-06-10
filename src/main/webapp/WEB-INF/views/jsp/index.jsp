<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
	<h1>Index</h1>
	<a href="home">go home</a><br>
	<a href="test1/11">/test1/1</a>
  <br />
  <a href="test2/222/kai">/test2/2/kai</a>
  <br />
  <fieldset>
    <legend>/test3?id=&name=</legend>
      Id: <input type="number" name="id" id="id"/> <br /> 
      Name: <input type="text" name="name" id="name"/> <br /> 
      <input type="submit" value="submit" id ="submit"/>
  </fieldset>
<!--         <div id="server-results"></div> -->
<p id="test1">This is a paragraph.</p>
  
  <script type="text/javascript">
	$("#submit").on("click", function(event) {
		event.preventDefault();
		var id = $("#id").val();
	  	var name = $("#name").val();
	  	var data_form = {};
	  	data_form["id"] = id;
	  	data_form["name"] = name;
	  	$.ajax({
	  		type: "POST",
	  		url: "${pageContext.request.contextPath}/getJson",
			data: {data_form: JSON.stringify(data_form), id: id, name: name},
// 			contentType: 'application/json; charset=UTF-8',
// 			dataType: 'json',
	  		success : function(data) {
	              alert(JSON.stringify(data));
	              var res = JSON.stringify(data);
// 	              $("#server-results").innerHTML =  "nội dung result" + data;
					if(res != null || res != undefined){
						$("#test1").text(res);
					} else {
						$("#test1").text("xxx");
					}
					$("#test1").css("color","red");
	            },
            error: function(){                     
                alert('Error while request..');
            }
	  	});
	});
  </script>
</body>
</html>