TYPE=VIEW
query=select `bdclick4`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick4`.`bdnc`.`valor`) AS `SumaNc`,`bdclick4`.`bdverificadorfacturas`.`total` AS `total`,`bdclick4`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick4`.`bdnc` join `bdclick4`.`bdverificadorfacturas` on((`bdclick4`.`bdnc`.`factura` = `bdclick4`.`bdverificadorfacturas`.`factura`))) group by `bdclick4`.`bdverificadorfacturas`.`total`,`bdclick4`.`bdverificadorfacturas`.`factura`,`bdclick4`.`bdverificadorfacturas`.`factura`
md5=9c0869da2d8be959d2deec0971410d0b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick4`.`bdnc`.`valor`) AS `SumaNc`,`bdclick4`.`bdverificadorfacturas`.`total` AS `total`,`bdclick4`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick4`.`bdnc` join `bdclick4`.`bdverificadorfacturas` on((`bdclick4`.`bdnc`.`factura` = `bdclick4`.`bdverificadorfacturas`.`factura`))) group by `bdclick4`.`bdverificadorfacturas`.`total`,`bdclick4`.`bdverificadorfacturas`.`factura`,`bdclick4`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
