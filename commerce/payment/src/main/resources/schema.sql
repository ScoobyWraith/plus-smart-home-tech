CREATE TABLE IF NOT EXISTS payments (
    payment_id VARCHAR(36) NOT NULL PRIMARY KEY,
    total_payment DOUBLE PRECISION,
    delivery_price DOUBLE PRECISION,
    fee_total DOUBLE PRECISION
);
