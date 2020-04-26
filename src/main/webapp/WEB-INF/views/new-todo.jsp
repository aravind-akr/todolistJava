<%@include file="../common/header.jspf"%>
<%@include file="../common/navigation.jspf"%>
	<div class="container">
		Your New:
		<form method="POST" action="/addTodo.do">
			<fieldset class="form-group">
				<label>Description</label>
				<input name="todo" type="text" class="form-control"/><br>
			</fieldset>
			<fieldset class="form-group">
				<label>Category</label>
				<input name="category" type="text" class="form-control"/> <br>
			</fieldset>
			
			
			<input name="add" type="submit" class="btn btn-success"/>
		</form>
	</div>
<%@include file="../common/footer.jspf"%>
