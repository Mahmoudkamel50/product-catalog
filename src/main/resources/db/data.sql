create table product(
                        product_id number(10) not null,
                        nameEn varchar2(20) ,
                        nameAr varchar2(20) ,
                        price number(10),
                        quantity number(20),
                        image varchar2(20),

                        constraint product_id_pk primary key (product_id)
);

create table Customer(
                         customer_id number(10) not null,
                         customer_name varchar2(20) ,
                         email varchar2(20) ,

                         constraint customer_id_pk primary key (customer_id)
);

