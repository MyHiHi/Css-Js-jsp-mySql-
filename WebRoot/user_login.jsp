<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ include file="login_header.jsp" %>

        <!-- Top content -->
        <div class="top-content" id="myForm">
        	
            <div class="inner-bg">
                <div class="container">
                  
                    <div class="row">
                    	
                        <div  class="col-sm-5 form-box center" >
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Get our eBook</h3>
                            		<p>Fill in the form below to get instant access:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-pencil"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="user_login.do" method="post"  class="registration-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-first-name">用户名</label>
			                    		　<input class="form-control" id="form-first-name" class="form-first-name form-control"  id="name" type="text" name="userName" placeholder="输入用户名"> 	
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-last-name">密码</label>
			                        	<input type="password" name="password" placeholder="输入密码" class="form-control" id="form-last-name">
			                        </div>
			                        <div class="form-group">
			                        	  
					                            <input type="text" style="" id="code" name="verifyCode" placeholder="请输入验证码">  
					                         
					                      
					                            <img id="code" src="VerifyCode.do"  onclick="myRefersh(this)"> 
					                            <p id="verifyCode"></p>
					                  
					                     
			                        </div>
			                        
			                        <button type="submit" id="submit" class="btn">登录</button>
			                        <button type="submit" class="btn btn-success" onclick="location.href='user_add.jsp'">注册</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
<%@ include file="login_footer.jsp" %>
