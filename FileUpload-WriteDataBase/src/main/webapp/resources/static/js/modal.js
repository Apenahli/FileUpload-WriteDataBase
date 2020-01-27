function geteditform(id){
	
	$.ajax({
		  
		type:"get",
		
		url:"/departments/update/" + id,
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			/*console.log('test')*/
		}
	})
}

function getDeleteForm(id){
	
	$.ajax({
		  
		type:"get",
		
		url:"/departments/delete/" + id,
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			console.log('test')
		}
	})
}


function getInsertForm(){
	
	$.ajax({
		  
		type:"get",
		
		url:"/departments/add",
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			console.log('test')
		}
	})
}



function getDeactvForm(id){
	
	$.ajax({
		  
		type:"get",
		
		url:"/employee/update_deactive/" + id,
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			/*console.log('test')*/
		}
	})
} 

function insertEmployee(){
	
	$.ajax({
		  
		type:"get",
		
		url:"/employee/new",
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			console.log('test')
		}
	})
}


function editEmployee(id){
	
	$.ajax({
		  
		type:"get",
		
		url:"/employee/edit/" + id,
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
		}
	})
}


function getBirthday(){
	
	$.ajax({
		  
		type:"get",
		
		url:"/employee/birthday",
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			console.log('test')
		}
	})
}

function contract(){
	
	$.ajax({
		  
		type:"get",
		
		url:"/employee/contract",
		
		dataType:"html",
		
		success:function(response){
			
			$('.modal-content').html(response);
			
			$('#exampleModal').modal('show');
			
			console.log('test')
		}
	})
}


