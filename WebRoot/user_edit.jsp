<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="header.jsp"%> 

<!-- MAIN -->
		<div class="main">
		
		
		<!-- 这里**************************888888 -->
		
		
			<!-- WRAPPER -->
	<div id="wrapper" style="margin-top:100px">
		<div class="vertical-align-wrap">
			<div class="vertical-align-middle">
				<div class="auth-box ">
					<div class="left">
						<div class="content">
							<div class="header">
								<div class="logo text-center"><img src="assets/img/logo-dark.png" alt="Klorofil Logo"></div>
								<p class="lead">Login to your account</p>
							</div>
							<form class="form-auth-small" action="user_update.do" method="post">
								<input type="hidden" value="${user.id }" name="id">
								<div class="form-group">
									<label for="signin-email" class="control-label sr-only">用户名</label>
									<input type="text" class="form-control" id="signin-email" name="userName"  value="${user.userName }">
								</div>
								
								
								<div class="form-group">
									<label for="signin-password" class="control-label sr-only">密码</label>
									
									<input type="password" class="form-control" name="password" id="signin-password" value="${user.password }" placeholder="Password">
								</div>
								
								<div class="form-group">
									<label for="signin-email" class="control-label sr-only">地址</label>
									<textarea rows="10"  class="form-control" id="signin-email" cols="20" name="addr" >${user.addr }</textarea>
									
									
								</div>
								
								<div class="form-group">
									<label for="signin-email3" class="control-label sr-only">电话</label>
									<input type="text" class="form-control" id="signin-email3" name="phone"  value="${user.phone }">
								</div>
								
							
								<button type="submit" class="btn btn-primary btn-lg btn-block">提交</button>
								<div class="bottom">
									<span class="helper-text"><i class="fa fa-lock"></i> <a href="user_show.do">回到列表页</a></span>
								</div>
							</form>
						</div>
					</div>
					<div class="right">
						<div class="overlay"></div>
						<div class="content text">
							<h1 class="heading">Free Bootstrap dashboard template</h1>
							<p>by The Develovers</p>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!-- END WRAPPER -->
		
		
		
		
		
		
		
		
		
		
		<!-- 这里是**************************************** -->
		
	</div>
	
		<%@ include file="footer.jsp"%> 