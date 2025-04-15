CREATE DATABASE IF NOT EXISTS fintech_lab;
USE fintech_lab;
CREATE TABLE customer_details(
customer_id BIGINT PRIMARY KEY AUTO_INCREMENT,
full_name VARCHAR(100),
dob DATE,
email_id VARCHAR(100),
status VARCHAR(20),
created_by VARCHAR(50),
ws_id VARCHAR(50),
local_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
host_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
uuid VARCHAR(36) DEFAULT (UUID()));

CREATE TABLE customer_identification (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
customer_id BIGINT ,
pan_card_number VARCHAR(100),
aadhar_number VARCHAR(100),
ws_id VARCHAR(50),
local_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
host_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
uuid VARCHAR(36) DEFAULT (UUID()),
CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customer_details(customer_id)

)
select * from customer_details;
select * from customer_identification;
select * from customer_details join customer_identification where customer_details.customer_id= customer_identification.customer_id;
