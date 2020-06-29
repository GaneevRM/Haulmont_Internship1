package com.company.salesgr.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.salesgr.entity.Order;

@UiController("salesgr_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}