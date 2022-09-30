TYPE=VIEW
query=select `bdclick3`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick3`.`bdnc`.`valor`) AS `SumaNc`,`bdclick3`.`bdverificadorfacturas`.`total` AS `total`,`bdclick3`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick3`.`bdnc` join `bdclick3`.`bdverificadorfacturas` on((`bdclick3`.`bdnc`.`factura` = `bdclick3`.`bdverificadorfacturas`.`factura`))) group by `bdclick3`.`bdverificadorfacturas`.`total`,`bdclick3`.`bdverificadorfacturas`.`factura`,`bdclick3`.`bdverificadorfacturas`.`factura`
md5=da66f33d5e9e73a45c52a96a820639e2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick3`.`bdnc`.`valor`) AS `SumaNc`,`bdclick3`.`bdverificadorfacturas`.`total` AS `total`,`bdclick3`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick3`.`bdnc` join `bdclick3`.`bdverificadorfacturas` on((`bdclick3`.`bdnc`.`factura` = `bdclick3`.`bdverificadorfacturas`.`factura`))) group by `bdclick3`.`bdverificadorfacturas`.`total`,`bdclick3`.`bdverificadorfacturas`.`factura`,`bdclick3`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
