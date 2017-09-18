<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : EditUser
    Created on : Sep 16, 2017, 7:59:17 AM
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
                        <webuijsf:label id="label2" style="left: 192px; top: 48px; position: absolute" text="Update User"/>
                        <webuijsf:label id="label3" style="left: 120px; top: 96px; position: absolute" text="First Name"/>
                        <webuijsf:label id="label4" style="left: 120px; top: 120px; position: absolute" text="Middle Name"/>
                        <webuijsf:label id="label5" style="left: 120px; top: 144px; position: absolute" text="Last Name"/>
                        <webuijsf:textField binding="#{pages$EditUser.txtFirst}" id="txtFirst" style="left: 240px; top: 96px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$EditUser.txtMiddle}" id="txtMiddle" style="left: 240px; top: 120px; position: absolute"/>
                        <webuijsf:textField binding="#{pages$EditUser.txtLast}" id="txtLast" style="left: 240px; top: 144px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$EditUser.btnRegister_action}" id="btnRegister"
                            style="left: 263px; top: 192px; position: absolute" text="Update"/>
                        <webuijsf:button actionExpression="#{pages$EditUser.btnBack_action}" id="btnBack" style="left: 167px; top: 192px; position: absolute" text="Back"/>
                        <webuijsf:messageGroup id="info1" style="left: 408px; top: 96px; position: absolute"/>
                        <webuijsf:label id="label1" style="position: absolute; left: 120px; top: 72px" text="ID"/>
                        <webuijsf:textField binding="#{pages$EditUser.txtId}" disabled="true" id="txtId" style="left: 240px; top: 72px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
