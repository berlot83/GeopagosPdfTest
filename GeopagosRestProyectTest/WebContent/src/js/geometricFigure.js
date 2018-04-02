/**
 *  
 */

function registerMessures(){
	var height= document.getElementById("height");
	var width= document.getElementById("width");
	var surface= document.getElementById("surface");
	var diameter= document.getElementById("diameter");
	var type= document.getElementById("type");
	
	var xhr= new XMLHttpRequest();
	var url= "/GeopagosRestProyectTest/rest/geometric/messures";
	
	xhr.onreadystatechange= function(){
		if(this.readyState == 4 && this.status == 200){
			alert(xhr.responseText);
			alert("You have inserted a " + type.value);
	}	
}
xhr.open("POST", url, true);
xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xhr.send("height="+height.value+"&width="+width.value+"&surface="+surface.value+"&diameter="+diameter.value+"&type="+type.value);	
}

function getAllMessures(){
	
	var xhr= new XMLHttpRequest();
	var url= "/GeopagosRestProyectTest/rest/geometric/getAllMessures";
	
	xhr.onreadystatechange= function(){
		if(this.readyState == 4 && this.status == 200){
			alert(xhr.responseText);
	}	
}
xhr.open("POST", url, true);
xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xhr.send();	
}