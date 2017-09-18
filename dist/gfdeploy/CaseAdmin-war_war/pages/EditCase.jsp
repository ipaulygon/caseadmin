<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : EditCase
    Created on : Sep 16, 2017, 3:11:14 AM
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
                        <webuijsf:label id="label1" style="left: 48px; top: 24px; position: absolute" text="Update Case"/>
                        <webuijsf:label id="label2" style="left: 48px; top: 72px; position: absolute" text="Case No."/>
                        <webuijsf:label id="label3" style="left: 48px; top: 96px; position: absolute" text="Case Title"/>
                        <webuijsf:label id="label4" style="left: 48px; top: 192px; position: absolute" text="Case Category"/>
                        <webuijsf:label id="label5" style="left: 48px; top: 216px; position: absolute" text="Case Status"/>
                        <webuijsf:label id="label6" style="left: 48px; top: 144px; position: absolute" text="Nature of Case"/>
                        <webuijsf:textField binding="#{pages$EditCase.txtNo}" disabled="true" id="txtNo" style="left: 192px; top: 72px; position: absolute"/>
                        <webuijsf:textArea binding="#{pages$EditCase.txtTitle}" id="txtTitle" style="left: 192px; top: 96px; position: absolute"/>
                        <webuijsf:textArea binding="#{pages$EditCase.txtNature}" id="txtNature" style="left: 192px; top: 144px; position: absolute"/>
                        <webuijsf:dropDown binding="#{pages$EditCase.txtCategory}" disabled="true" id="txtCategory"
                            items="#{pages$EditCase.txtCategoryDefaultOptions.options}" style="left: 192px; top: 192px; position: absolute"/>
                        <webuijsf:dropDown binding="#{pages$EditCase.txtStatus}" id="txtStatus" items="#{pages$EditCase.txtStatusDefaultOptions.options}" style="left: 192px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{pages$EditCase.btnBack_action}" binding="#{pages$EditCase.btnBack}" id="btnBack"
                            style="left: 47px; top: 264px; position: absolute" text="Back"/>
                        <webuijsf:button actionExpression="#{pages$EditCase.btnSubmit_action}" binding="#{pages$EditCase.btnSubmit}" id="btnSubmit"
                            style="left: 143px; top: 264px; position: absolute" text="Submit"/>
                        <webuijsf:messageGroup id="info" style="left: 408px; top: 72px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
