create table hr.products(
                            product_id number(10) not null,
                            nameEn varchar2(20) ,
                            nameAr varchar2(20) ,
                            price number(10),
                            quantity number(20),
                            buying_Counter number(20),
                            image varchar2(20),

                            constraint product_id_pk primary key (product_id)
);

create SEQUENCE hr.products_seq;

create table hr.Customer(
                            customer_id number(10) not null,
                            customer_name varchar2(20) ,
                            email varchar2(20) ,

                            constraint customer_id_pk primary key (customer_id)
);

create SEQUENCE hr.customer_seq;

create table hr.order_items
(
    order_items_id number(10) not null,
    quantity       number,
    total_Amount   number,

    product_id number(4),
    constraint order_item_fk FOREIGN KEY (product_id)
    references product(product_id)

);

create table hr.orders
(
    order_id number(10) ,
    order_description VARCHAR2(50),
    customer_id number(4),
    order_items_id number(10) ,
    total_amount NUMBER(4),

    constraint order_id_pk primary key (order_id),

    constraint customer_id_fk FOREIGN KEY (customer_id)
        references hr.customer(customer_id),

    constraint order_items_fk FOREIGN KEY (order_items_id)
        references hr.order_items(order_items_id)

);


