package com.example.application.views.page2;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Page 2")
@Route("page-2")
@Menu(order = 1, icon = "line-awesome/svg/pencil-ruler-solid.svg")
public class Page2View extends Composite<VerticalLayout> {

    public Page2View() {
        H1 h1 = new H1();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("This is the second page of the test site");
        h1.setWidth("max-content");
        getContent().add(h1);
    }
}
