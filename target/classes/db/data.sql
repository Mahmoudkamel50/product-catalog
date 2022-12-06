--liquibase formatted sql

--changeset Mahmoud.Kamel:"create categories table"
create table hr.categories(
                              id number(4) primary key,
                              name varchar2(20)
);
--changeset Mahmoud.Kamel:"create categories SEQUENCE"
create SEQUENCE hr.categories_seq;

--changeset Mahmoud.Kamel:"create products table"
create table hr.products(
                            id number(10) not null,
                            nameEn varchar2(20) ,
                            nameAr varchar2(20) ,
                            price number(10),
                            quantity number(20),
                            buying_Counter number(20),
                            image varchar2(20),
                            category_id number(4),


                            constraint products_category_fk FOREIGN KEY (category_id)
                                references hr.categories(id),

                            constraint product_id_pk primary key (id)
);
--changeset Mahmoud.Kamel:"create products SEQUENCE"
create SEQUENCE hr.products_seq;

--changeset Mahmoud.Kamel:"create Customers table"
create table hr.Customers(
                             id number(10) primary key,
                             first_name varchar2(20) ,
                             last_name varchar2(20) ,
                             email varchar2(20) ,
                             password VARCHAR2(20),
                             phone VARCHAR2(20)
);
--changeset Mahmoud.Kamel:"create Customers SEQUENCE"
create SEQUENCE hr.customers_seq;

--changeset Mahmoud.Kamel:"create orders table"
create table hr.orders
(
    id number(10) primary KEY,
    customer_id number(4),
    total_amount NUMBER(4),


    constraint orders_customer_fk FOREIGN KEY (customer_id)
        references hr.customers(id)

);
--changeset Mahmoud.Kamel:"create orders SEQUENCE"
create SEQUENCE hr.orders_seq;


--changeset Mahmoud.Kamel:"create order_items table"
create table hr.order_items
(
    id number(10) primary key,
    product_id number(4),
    order_id number(4),
    quantity  number,
    price  number,


    constraint product_order_item_fk FOREIGN KEY (product_id)
        references hr.products(id),

    constraint order_item_id_fk FOREIGN KEY (order_id)
        references hr.orders(id)
);
--changeset Mahmoud.Kamel:"create order_items SEQUENCE"
create SEQUENCE hr.order_items_seq;








