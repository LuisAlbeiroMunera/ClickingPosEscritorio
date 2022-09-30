TYPE=VIEW
query=select `bdclick2`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick2`.`bdnc`.`valor`) AS `SumaNc`,`bdclick2`.`bdverificadorfacturas`.`total` AS `total`,`bdclick2`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick2`.`bdnc` join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdnc`.`factura` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdverificadorfacturas`.`total`,`bdclick2`.`bdverificadorfacturas`.`factura`,`bdclick2`.`bdverificadorfacturas`.`factura`
md5=ef5ca5479630d699ea47d2f8948091a4
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick2`.`bdnc`.`valor`) AS `SumaNc`,`bdclick2`.`bdverificadorfacturas`.`total` AS `total`,`bdclick2`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick2`.`bdnc` join `bdclick2`.`bdverificadorfacturas` on((`bdclick2`.`bdnc`.`factura` = `bdclick2`.`bdverificadorfacturas`.`factura`))) group by `bdclick2`.`bdverificadorfacturas`.`total`,`bdclick2`.`bdverificadorfacturas`.`factura`,`bdclick2`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
