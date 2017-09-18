<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Register
    Created on : Sep 16, 2017, 12:14:01 AM
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
                        <webuijsf:label id="label8" style="left: 192px; top: 48px; position: absolute" text="ID"/>
                        <webuijsf:label id="label1" style="left: 264px; top: 24px; position: absolute" text="Register"/>
                        <webuijsf:label id="label2" style="left: 192px; top: 72px; position: absolute" text="First Name"/>
                        <webuijsf:label id="label3" style="left: 192px; top: 96px; position: absolute" text="Middle Name"/>
                        <webuijsf:label id="label4" style="left: 192px; top: 120px; position: absolute" text="Last Name"/>
                        <webuijsf:label id="label5" style="left: 192px; top: 168px; position: absolute" text="Username"/>
                        <webuijsf:label id="label6" style="left: 192px; top: 192px; position: absolute" text="Password"/>
                        <webuijsf:label id="label7" style="left: 192px; top: 216px; position: absolute" text="Confirm Password"/>
                        <webuijsf:textField binding="#{pages$Register.txtId}" disabled="true" id="txtId" style="left: 312px; top: 48px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$Register.txtFirst}" id="txtFirst" style="left: 312px; top: 72px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$Register.txtMiddle}" id="txtMiddle" style="left: 312px; top: 96px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$Register.txtLast}" id="txtLast" style="left: 312px; top: 120px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$Register.txtUser}" id="txtUser" style="left: 312px; top: 168px; position: absolute"/>
                        <webuijsf:passwordField binding="#{pages$Register.txtPass}" id="txtPass" style="left: 312px; top: 192px; position: absolute"/>
                        <webuijsf:passwordField binding="#{pages$Register.txtCPass}" id="txtCPass" style="left: 312px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$Register.btnRegister_action}" binding="#{pages$Register.btnRegister}" id="btnRegister"
                            style="left: 335px; top: 264px; position: absolute" text="Register"/>
                        <webuijsf:button actionExpression="#{pages$Register.btnBack_action}" binding="#{pages$Register.btnBack}" id="btnBack"
                            style="left: 239px; top: 264px; position: absolute" text="Back"/>
                        <webuijsf:messageGroup binding="#{pages$Register.info}" id="info" style="left: 480px; top: 72px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
