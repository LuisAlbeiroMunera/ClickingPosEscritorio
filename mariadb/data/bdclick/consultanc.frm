TYPE=VIEW
query=select `bdclick`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick`.`bdnc`.`valor`) AS `SumaNc`,`bdclick`.`bdverificadorfacturas`.`total` AS `total`,`bdclick`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick`.`bdnc` join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdnc`.`factura` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdverificadorfacturas`.`total`,`bdclick`.`bdverificadorfacturas`.`factura`,`bdclick`.`bdverificadorfacturas`.`factura`
md5=6e52500868179c52ec12d76f6618f8d6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick`.`bdnc`.`valor`) AS `SumaNc`,`bdclick`.`bdverificadorfacturas`.`total` AS `total`,`bdclick`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick`.`bdnc` join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdnc`.`factura` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdverificadorfacturas`.`total`,`bdclick`.`bdverificadorfacturas`.`factura`,`bdclick`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
