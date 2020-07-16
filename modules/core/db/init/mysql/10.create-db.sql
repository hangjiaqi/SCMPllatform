-- begin TRIPARTITELOGISTICS_PICK_UP_PLAN_DETAIL
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
)^
-- end TRIPARTITELOGISTICS_PICK_UP_PLAN_DETAIL
-- begin TRIPARTITELOGISTICS_PICK_UP_PLAN
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
)^
-- end TRIPARTITELOGISTICS_PICK_UP_PLAN
-- begin TRIPARTITELOGISTICS_SALES_ORDER
create table TRIPARTITELOGISTICS_SALES_ORDER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    SALES_DOC varchar(255),
    QUANTITY integer,
    MATERIAL_NUMBER varchar(255),
    TYPE_ varchar(255),
    KLU varchar(255),
    REQ_DEL date,
    PO_NR varchar(255),
    ONE_DEL date,
    LATEST_DEL date,
    NEXT_DEL date,
    ASSEMBLY_DATE date,
    BAN integer,
    VFM integer,
    VFMB_DATE date,
    VKU integer,
    VKU_DATE date,
    AVAILABLE integer,
    --
    primary key (ID)
)^
-- end TRIPARTITELOGISTICS_SALES_ORDER
