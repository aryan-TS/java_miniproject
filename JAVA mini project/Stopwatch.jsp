<%@ page language="java" contentType="text/html; charset=UTF-8” pageEncoding="UTF-8"%>
 	<!DOCTYPE html>
<head>
 <meta charset="UTF-8"> 
<title>
Stopwatch
</title>
 <style>
body {font-family: Arial, sans-serif; display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh; margin: 0; background-color: #f0f0f0;}
 	h1{ margin-bottom: 20px;} 
p {font-size: 2rem; margin-bottom: 20px;}
 button {font-size: 1.5rem; margin: 5px; padding: 10px 20px; cursor: pointer;}
 	</style>
 </head> 
<body>
 		<h1>Stopwatch</h1> 
<p>Elapsed time: ${elapsedTime} ms</p>
 		<button onclick="location.href='stopwatch?action=start'">Start</button> 
<button onclick="location.href='stopwatch?action=stop'">Stop</button>
 		<button onclick="location.href='stopwatch?action=reset'">Reset</button>
 	</body>
 </html>
