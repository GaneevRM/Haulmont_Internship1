package com.company.salesgr.web.screens.customer;

import com.company.salesgr.entity.Order;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.salesgr.entity.Customer;

import javax.inject.Inject;

@UiController("salesgr_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")

public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
    
}