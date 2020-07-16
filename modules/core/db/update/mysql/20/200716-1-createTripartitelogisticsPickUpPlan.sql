create table TRIPARTITELOGISTICS_PICK_UP_PLAN (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    SALES_ORDER_NR varchar(255),
    PLANNED_TIME date,
    PLANNED_QTY integer,
    ACTUAL_QTY integer,
    ACTUAL_TIME date,
    GENERATE_TIME date,
    --
    primary key (ID)
);