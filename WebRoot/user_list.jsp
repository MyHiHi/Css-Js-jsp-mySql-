
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="header.jsp"%> 


<!-- MAIN -->
		<div class="main">
		
		
		
 <div class="main-content">
				<div class="container-fluid">
					<h3 class="page-title">Tables</h3>
					<div class="row">
						<div class="col-md-12">
							<!-- BASIC TABLE -->
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title">Basic Table</h3>
								</div>
								<div class="panel-body">
									<table class="table">
										<thead>
											<tr>
												<th>ID</th><th>用户名</th><th>密码</th><th>地址</th><th>电话</th><th>注册日期</th><th>操作</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="users" items="${users }">
								    			<tr >
								    				<td>${users.id}</td>
								    				<td>${users.userName}</td>
								    				<td>${users.password}</td>
								    				<td>${users.addr}</td>
								    				<td>${users.phone}</td>
								    				<td>${users.rdate}</td>
								    				<td><a href="user_delete.do?id=${users.id }">删除</a>　　<a href="user_edit.do?id=${users.id }">编辑</a></td>
								    				
								    			
    											</tr>
    		
    										</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<!-- END BASIC TABLE -->
						</div>
 					</div>
 				</div>
		
		<!-- 这里是**************************************** -->
		
	</div>
	
	<%@ include file="footer.jsp"%> 