package com.example.application.views.home;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Home")
@Route("")
@Menu(order = 0, icon = "line-awesome/svg/home-solid.svg")
public class HomeView extends Composite<VerticalLayout> {

    public HomeView() {
        H1 h1 = new H1();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("This is the first page of the test site");
        h1.setWidth("max-content");
        getContent().add(h1);
    }
}
