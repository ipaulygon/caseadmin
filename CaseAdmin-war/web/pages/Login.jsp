<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Login
    Created on : Sep 15, 2017, 11:59:24 PM
    Author     : Andrei
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="left: 240px; top: 24px; position: absolute" text="Log In"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 168px; top: 72px" text="Username"/>
                        <webuijsf:label id="label3" style="left: 168px; top: 96px; position: absolute" text="Password"/>
                        <webuijsf:textField binding="#{pages$Login.txtUser}" id="txtUser" style="left: 264px; top: 72px; position: absolute"/>
                        <webuijsf:passwordField binding="#{pages$Login.txtPass}" id="txtPass" style="left: 264px; top: 96px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$Login.btnLogin_action}" binding="#{pages$Login.btnLogin}" id="btnLogin"
                            style="left: 191px; top: 144px; position: absolute" text="Login"/>
                        <webuijsf:button actionExpression="#{pages$Login.btnRegister_action}" binding="#{pages$Login.btnRegister}" id="btnRegister"
                            style="left: 287px; top: 144px; position: absolute" text="Register"/>
                        <webuijsf:messageGroup binding="#{pages$Login.info}" id="info" style="left: 432px; top: 48px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
