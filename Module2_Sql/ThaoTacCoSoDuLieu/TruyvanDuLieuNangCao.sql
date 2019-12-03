SELECT productCode,productName,buyPrice,textDescription
FROM products
INNER JOIN productlines
ON products.productLine=productlines.productLine
WHERE buyPrice>56.6 AND buyPrice<95.6;

SELECT productCode,productName,productLine,quantityInStock,buyPrice,productVendor
FROM products
WHERE productLine='Classic Cars' or productVendor='Min Lin Diecast'