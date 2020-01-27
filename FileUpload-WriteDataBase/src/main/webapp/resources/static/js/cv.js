/* --------------------------- TOP  SKILLS- ----------------------------------------- */

function getInsertForm(id) {

	$.ajax({

		type : "get",

		url : "/cv/add/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

function getEditSkill(skl_id, emp_id) {

	$.ajax({

		type : "get",

		url : "/cv/editSkill/"+skl_id+"/"+emp_id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

/*
 * --------------------------- Language-
 * -----------------------------------------
 */

function getInsertLanguage(id) {

	$.ajax({

		type : "get",

		url : "/cv/addLanguage/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

function editLanguage(lang_id,emp_id) {

	$.ajax({

		type : "get",

		url : "/cv/editLanguage/"+lang_id+"/"+emp_id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

/* --------------------------- Summary ----------------------------------------- */

function getInsertSummary(id) {

	$.ajax({

		type : "get",

		url : "/cv/addSummary/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

function getEditSummary(id) {

	$.ajax({

		type : "get",

		url : "/cv/editSummary/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

/*
 * --------------------------- Experience
 * -----------------------------------------
 */

function getInserExperience(id) {

	$.ajax({

		type : "get",

		url : "/cv/addExperience/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

function getEditExperience(id) {

	$.ajax({

		type : "get",

		url : "/cv/editExperience/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

/*
 * --------------------------- Education
 * -----------------------------------------
 */

function getInserEducation(id) {

	$.ajax({

		type : "get",

		url : "/cv/addEducation/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

function getEditEducation(id) {

	$.ajax({

		type : "get",

		url : "/cv/editEducation/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}


/*
 * --------------------------- certificate-
 * -----------------------------------------
 */

function getInsertCertificate(id) {

	$.ajax({

		type : "get",

		url : "/cv/addCertificate/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}

function editCertificate(id) {

	$.ajax({

		type : "get",

		url : "/cv/editCertificate/" + id,

		dataType : "html",

		success : function(response) {

			$('.modal-content').html(response);

			$('#exampleModal').modal('show');

			console.log('test')
		}
	})
}






