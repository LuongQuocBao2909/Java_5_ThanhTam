<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/30/2023
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<article ng-controller="giohang">

    <div class="container">
        <section class="gioihang" >
            <div class="row">
                <div class="col-8">
                    <div class="title-h2"><h2>GIỎ HÀNG ( <span>{{carts.length}}</span> sản phẩm )</h2> </div>
                    <div class="progress" style="height: 1px;">
                        <div class="progress-bar bg-danger" role="progressbar" aria-label="Example 1px high" style="width: 25%;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <br>
                    <div class="card mb-12"  ng-repeat="c in carts" ng-init = "setTotals(c)">
                        <div class="row g-0">
                            <div class="col-md-2">
                                <a href="#chitietsp/{{c.id}}"> <img src="{{c.image}}" class="img-fluid rounded-start" alt="..." width="100%"></a>
                            </div>
                            <div class="col-md-10">
                                <div class="card-body">
                                    <h5 class="card-title">{{c.ten}}</h5>
                                    <p class="card-text">Số lượng : <button ng-click="it(c)">-</button > <input type="number" name="soluong" id="" max="100" min="0" value="{{c.soluong}}" > <button ng-click="nhieu(c)">+</button>  </p>
                                    <p>Giá tiền : {{c.price | number}}đ</p>
                                    <button class="btn btn-danger" style="width:100px ;" ng-click="remove_cart(c)">Xóa</button>
                                    </p>
                                </div>

                            </div>

                        </div>

                    </div>
                </div>

                <div class="col-4">
                    <div class="thongtin">
                        <h6>Tổng tiền </h6>
                        <p>Tạm tính : <span class="tien" ng-model="total">{{total | number}}</span></p>
                        <hr>
                        <p>Vận chuyển :  <span class="tien">Miễn phí vận chuyển</span></p>
                        <hr>
                        <p>Thành tiền :  <span class="tien">{{total | number}}</span></p>
                        <hr>
                        <button class="btn btn-danger" style="width: 100%;" ng-click="dathang(c)">Tiến hàng đặt hàng</button>
                    </div>
                </div>
            </div>
            <a href="#lichsu" class="btn btn-outline-secondary">Lịch sử mua hàng</a>
        </section>
    </div>

</article>


