<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/retina-1.1.0.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->
        	<script type="text/javascript">
     
					                     		
					                     		$(document).ready(function(){
													changeImg();
												}); 
					                     		
					                     		function changeImg() {        
											        var imgSrc = $("#code");    
											        var src = imgSrc.attr("src"); 
											        console.log(src)       
											        imgSrc.attr("src", chgUrl(src));
											        console.log(imgSrc.attr("src"));
											    }
    
											    // 时间戳
											    // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
											    function chgUrl(url) {
											        var timestamp = (new Date()).valueOf();
											        /*
											        url = url.substring(0, 20);
											        if ((url.indexOf("&") >= 0)) {
											            url = url + "×tamp=" + timestamp;
											        } else {
											            url = url + "?timestamp=" + timestamp;
											        }
											        */
											         url = url + "?timestamp=" + timestamp;
											        return url;
											    }
												    function myReload() {  
												        document.getElementById("CreateCheckCode").src =   
												        document.getElementById("CreateCheckCode").src+ "?nocache=" + new Date().getTime();  
												    }  
					                     		
					                     		
					                     		
					                     		
					                     		
					                     		
					                     	
					                     	</script>
<script type="text/javascript">

	
		
		function myRefersh( e ) {  
		
		      
		    const source = e.src ; // 获得原来的 src 中的内容  
		    //console.log( "source : " + source  ) ;  
		      
		    var index = source.indexOf( "?" ) ;  // 从 source 中寻找 ? 第一次出现的位置 (如果不存在则返回 -1 )  
		    //console.log( "index : " + index  ) ;  
		      
		    if( index > -1 ) { // 如果找到了 ?  就进入内部  
		        var s = source.substring( 0 , index ) ; // 从 source 中截取 index 之前的内容 ( index 以及 index 之后的内容都被舍弃 )  
		        //console.log( "s : " + s  ) ;  
		          
		        var date = new Date(); // 创建一个 Date 对象的 一个 实例  
		        var time = date.getTime() ; // 从 新创建的 Date 对象的实例中获得该时间对应毫秒值  
		        e.src = s + "?time=" + time ; // 将 加了 尾巴 的 地址 重新放入到 src 上  
		          
		        //console.log( "***********",e.src ) ;  
		    } else {  
		        var date = new Date();  
		        e.src = source + "?time=" + date.getTime();  
		    }  
		    
		      
		}
			
			
</script>

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  </body>
</html>