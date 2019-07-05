function getResults(){
    let xhr = new XMLHttpRequest();
 
    xhr.onreadystatechange = function(){
        if (xhr.readyState === 4 & xhr.status === 200){
            let requestArr = JSON.parse(xhr.responseText);
            appendToTable(requestArr);
        }
    }
 
    xhr.open("GET", "DirectSupervisorHome", true);
 
    xhr.send();
 }
 
 function appendToTable(requestArr){
    let tableBody = document.getElementById('formtable');
 
    //tableBody.innerHTML = "";

    for (let i = 0; i < requestArr.length; i++){
        tableBody.innerHTML += `
        <tr>
        
        	
            <td>${requestArr[i].employee_id}</td>
            <td>${requestArr[i].form_id}</td>
            <td>${requestArr[i].firstName}</td>
            <td>${requestArr[i].lastName}</td>
            <td>${requestArr[i].eventDesc}</td>
            <td>${requestArr[i].address}</td>
            <td>${requestArr[i].city}</td>
            <td>${requestArr[i].state}</td>
            <td>${requestArr[i].zip}</td>
            <td>${requestArr[i].cost}</td>
            <td>${requestArr[i].time}</td>
            <td>${requestArr[i].date}</td>
            <td>${requestArr[i].gradingformat}</td>
            <td>${requestArr[i].grade}</td>
        </tr>
        `;
    }
 }

 
 window.onload = function() {

	    getResults();
	    
	    


	}