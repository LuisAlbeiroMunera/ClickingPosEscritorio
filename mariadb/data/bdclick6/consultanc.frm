TYPE=VIEW
query=select `bdclick6`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick6`.`bdnc`.`valor`) AS `SumaNc`,`bdclick6`.`bdverificadorfacturas`.`total` AS `total`,`bdclick6`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick6`.`bdnc` join `bdclick6`.`bdverificadorfacturas` on((`bdclick6`.`bdnc`.`factura` = `bdclick6`.`bdverificadorfacturas`.`factura`))) group by `bdclick6`.`bdverificadorfacturas`.`total`,`bdclick6`.`bdverificadorfacturas`.`factura`,`bdclick6`.`bdverificadorfacturas`.`factura`
md5=79857db74fa37a0a35c935b0de5ed836
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick6`.`bdnc`.`valor`) AS `SumaNc`,`bdclick6`.`bdverificadorfacturas`.`total` AS `total`,`bdclick6`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick6`.`bdnc` join `bdclick6`.`bdverificadorfacturas` on((`bdclick6`.`bdnc`.`factura` = `bdclick6`.`bdverificadorfacturas`.`factura`))) group by `bdclick6`.`bdverificadorfacturas`.`total`,`bdclick6`.`bdverificadorfacturas`.`factura`,`bdclick6`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
