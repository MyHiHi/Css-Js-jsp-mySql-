<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ include file="login_header.jsp" %>

        <!-- Top content -->
        <div class="top-content" id="myForm">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        
                        <div class="col-sm-5 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Sign up now</h3>
                            		<p>Fill in the form below to get instant access:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-pencil"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form"  action="user_add.do" method="post" class="registration-form">
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-first-name">用户名</label>
			                        	<input type="text" name="userName" placeholder="输入用户名" class="form-first-name form-control" id="form-first-name">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-last-name">密码</label>
			                        	<input type="password" name="password"  placeholder="输入密码" class="form-last-name form-control" id="form-last-name">
			                        </div>
			                    
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-about-yourself">地址</label>
			                   
			                        	<textarea  name="addr" placeholder="输入地址" 
			                        				class="form-about-yourself form-control" id="form-about-yourself"></textarea>
			                        </div>
			                        
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-email">电话</label>
			                        	
			                        	
			                        	<input type="text"  name="phone" placeholder="输入电话" class="form-email form-control" id="form-email">
			                        </div>
			                        <button type="submit" class="btn">注册</button>
			                        <button type="reset" class="btn">取消</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>

<%@ include file="login_footer.jsp"%>