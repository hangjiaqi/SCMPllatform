create table TRIPARTITELOGISTICS_PICK_UP_PLAN_DETAIL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    SALES_ORDER_ID varchar(32),
    PICK_UP_PLAN_ID varchar(32),
    TRANSPORT_QUANTITY integer,
    ACTUAL_TRANSPORT_QUANTITY integer,
    --
    primary key (ID)
);