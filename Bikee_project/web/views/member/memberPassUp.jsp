<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= '/views/common/header.jsp' %>
<%
Member m = (Member)request.getAttribute("member");
%>
<script>
$(function(){
	$('#nowPw').blur(function(){
		var inPw = $('#nowPw').val().trim();
		var oriPw =$('#oriPw').val().trim();
		if(inPw !=oriPw){
			alert("현재비밀번호가 일치하지않습니다.");
			$('#updatePw').val("");
			
		}
	})
	$('#updatePwCheck').blur(function(){
		var pw1=$('#updatePw').val().trim();
		var pw2=$('#updatePwCheck').val().trim();
		if(pw1!=pw2)
		{
			alert("비밀번호가 일치하지않습니다.");
			$('#updatePw').val("");
			$('#updatePwCheck').val("")
			$('#updatePw').focus();
		}
	});
});



</script>

<div class="container">

<div class="row">

    <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form role="form" method="post" id="updateForm" action="<%= request.getContextPath() %>/member/memberUpdateEnd">
			<h2>비밀번호 변경<small >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;수정할 정보를 입력해 주세요.</small></h2>
			<hr class="colorgraph">
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<label>현재 비밀번호</label>
						<input type="password"  name="nowPw" id="nowPw" value="" class="form-control input-lg" placeholder="현재 비밀번호" tabindex="1" required >
					</div>
					<!-- oriPw만들기 -->
					
					<hr>
					
					<div class="form-group">
						<label>수정할 비밀번호</label>
						<input type="password"  name="updatePw" id="updatePw" value="" class="form-control input-lg" placeholder="수정할 비밀번호" tabindex="2" required >
					</div>
					<hr>
					<div class="form-group">
						<label>수정할 비밀번호 확인</label>
						<input type="password"  name="updatePwCheck" id="updatePwCheck" value="" class="form-control input-lg" placeholder="수정할 비밀번호 확인" tabindex="3" required >
					</div>
				</div>
			</div>
			<hr class="colorgraph">
			<div class="row">
				<div class="col-xs-12 col-md-6"><input type="submit" value="수정완료" class="btn btn-default btn-block btn-lg" tabindex="7"></div>
				<div class="col-xs-12 col-md-6"><a href="#"  class="btn btn-default btn-block btn-lg">돌아가기</a></div>
			</div>
		</form>
	</div>
</div>
<!-- Modal -->
<div class="modal fade" id="t_and_c_m" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel">Terms & Conditions</h4>
			</div>
			<div class="modal-body">
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" data-dismiss="modal">I Agree</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</div>

























<%@ include file= '/views/common/footer.jsp' %>
