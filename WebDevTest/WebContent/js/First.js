/**
 * 
 */ 

function showAlert(name){
	var textEL = document.getElementById("tag1");
	console.log("RUN AWAY " + textEL.value);
	
	var divEL = document.getElementById("tag2");
	divEL.innerText = textEL.value;
	divEL.style.backgroundColor = "purple";
	}
function loadFunction(){
	console.log("THE PAGE HAS LOADED SIRE");
}
//function collapseBox(){
//	var boxEL = document.getElementById("cbox");
//	var divEL = document.getElementById("tag2");
//	var textEL = document.getElementById("tag1");
//	if(boxEL.checked == true){
//		divEL.style.height = "0px";
//		divEL.style.fontSize="0px";
//		console.log("HEIGHT=0");
//	}
//	else{
//		divEL.style.height = "100px";
//		divEL.style.fontSize="";
//		console.log("HEIGHT=100");
//	}
//}
function collapseBox(){
	var sel = $('#thetable');
	var boxEL = document.getElementById("box");
	if(boxEL.value == 'Hide Grades'){
			sel.animate(
					{height: 'toggle',
						}, 'slow');
			boxEL.value="Show Grades";
	}
	else{
			sel.animate(
					{height: 'toggle',
						}, 'slow');
			boxEL.value="Hide Grades";
	}
}

function filterClassBox(){
	var sel = $('#filterclassbox');
	var input = sel.val();
	var items = $('.classnamecol');
	items.parent().hide();
	items.filter(function() {
		return $(this).text().indexOf(input) == 0;
	}).parent().show();
}
function filterNameBox(){
	var sel = $('#filternamebox');
	var input = sel.val();
	var items = $('.namecol');
	items.parent().hide();
	items.filter(function() {
		return $(this).text().indexOf(input) == 0;
	}).parent().show();
}
function filterRoleBox(){
	var sel = $('#filterrolebox');
	var input = sel.val();
	var items = $('.rolecol');
	items.parent().hide();
	items.filter(function() {
		return $(this).text().indexOf(input) == 0;
	}).parent().show();
}

