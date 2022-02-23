$(function() {

	$('#search').on('click', function() {
		var form = $(this).parents('form');
		form.attr('action', '/member/search');
		form.submit();
	});

});