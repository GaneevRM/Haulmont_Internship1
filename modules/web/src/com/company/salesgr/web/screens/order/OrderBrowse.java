package com.company.salesgr.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.salesgr.entity.Order;

@UiController("salesgr_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}