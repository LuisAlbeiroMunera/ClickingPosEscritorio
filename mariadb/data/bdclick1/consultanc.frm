TYPE=VIEW
query=select `bdclick1`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick1`.`bdnc`.`valor`) AS `SumaNc`,`bdclick1`.`bdverificadorfacturas`.`total` AS `total`,`bdclick1`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick1`.`bdnc` join `bdclick1`.`bdverificadorfacturas` on((`bdclick1`.`bdnc`.`factura` = `bdclick1`.`bdverificadorfacturas`.`factura`))) group by `bdclick1`.`bdverificadorfacturas`.`total`,`bdclick1`.`bdverificadorfacturas`.`factura`,`bdclick1`.`bdverificadorfacturas`.`factura`
md5=4c248b53bd4ee3dc9efa58622e7211ee
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick1`.`bdnc`.`valor`) AS `SumaNc`,`bdclick1`.`bdverificadorfacturas`.`total` AS `total`,`bdclick1`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick1`.`bdnc` join `bdclick1`.`bdverificadorfacturas` on((`bdclick1`.`bdnc`.`factura` = `bdclick1`.`bdverificadorfacturas`.`factura`))) group by `bdclick1`.`bdverificadorfacturas`.`total`,`bdclick1`.`bdverificadorfacturas`.`factura`,`bdclick1`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
