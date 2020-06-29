package com.company.salesgr.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.salesgr.entity.Customer;

@UiController("salesgr_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}