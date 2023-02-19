<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/30/2023
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
    <div class="container" style="width: 800px">
        <h2 style="text-align: center">TẠO TÀI KHOẢN</h2>
        <form:form
                modelAttribute="userDTO"
                method="POST"
                action="${ pageContext.request.contextPath }/dangki/store">
            <div class="form-group mt-3">
                <div class="form-group mb-3">
                    <label for="hoTen">Họ tên</label>
                    <form:input path="hoTen" class="form-control" id="email" name="email" autocomplete="off" />
                    <form:errors path="hoTen" element="span" cssClass="text-danger" />
                </div>
                <div class="form-group mb-3">
                    <label for="username">UserName</label>
                    <form:input path="username" class="form-control" id="email" name="email" autocomplete="off" />
                    <form:errors path="username" element="span" cssClass="text-danger" />
                </div>
                <label for="email">Email</label>
                <form:input path="email" class="form-control" autocomplete="off" />
                <form:errors path="email" element="span" cssClass="text-danger" />
            </div>

            <div class="form-group mb-3">
                <label for="password">Password</label>
                <form:password path="password"  name="password" class="form-control" />
                <form:errors path="password" element="span" cssClass="text-danger" />
            </div>

            <div class="form-group mb-3">
                <label for="gioiTinh">Giới tính</label>
                <form:select path="gioiTinh" id="gioiTinh" class="form-control">
                    <form:option value="1">Nữ</form:option>
                    <form:option value="0">Nam</form:option>
                </form:select>
                <form:errors path="gioiTinh" element="span" cssClass="text-danger" />
            </div>

            <div class="form-group mb-3">
                <label for="role">Role</label>
                <form:select path="role" id="role" class="form-control">
                    <form:option value="0" >User</form:option>
                </form:select>
                <form:errors path="role" element="span" cssClass="text-danger" />
            </div>

            <div class="form-group mb-3">
                <button class="btn btn-danger">Đăng kí</button>
                <button type="reset" class="btn btn-danger">Clear</button>
            </div>
        </form:form>
    </div>

<br />

