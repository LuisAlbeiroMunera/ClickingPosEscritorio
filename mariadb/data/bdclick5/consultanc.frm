TYPE=VIEW
query=select `bdclick5`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick5`.`bdnc`.`valor`) AS `SumaNc`,`bdclick5`.`bdverificadorfacturas`.`total` AS `total`,`bdclick5`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick5`.`bdnc` join `bdclick5`.`bdverificadorfacturas` on((`bdclick5`.`bdnc`.`factura` = `bdclick5`.`bdverificadorfacturas`.`factura`))) group by `bdclick5`.`bdverificadorfacturas`.`total`,`bdclick5`.`bdverificadorfacturas`.`factura`,`bdclick5`.`bdverificadorfacturas`.`factura`
md5=d3a83a36b3c2a8d44ac64fae1368c3d9
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdverificadorfacturas`.`factura` AS `factura`,sum(`bdnc`.`valor`) AS `SumaNc`,`bdverificadorfacturas`.`total` AS `total`,`bdverificadorfacturas`.`factura` AS `factura2` from (`bdnc` join `bdverificadorfacturas` on((`bdnc`.`factura` = `bdverificadorfacturas`.`factura`))) group by `bdverificadorfacturas`.`total`,`bdverificadorfacturas`.`factura`,`bdverificadorfacturas`.`factura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdverificadorfacturas`.`factura` AS `factura`,sum(`bdclick5`.`bdnc`.`valor`) AS `SumaNc`,`bdclick5`.`bdverificadorfacturas`.`total` AS `total`,`bdclick5`.`bdverificadorfacturas`.`factura` AS `factura2` from (`bdclick5`.`bdnc` join `bdclick5`.`bdverificadorfacturas` on((`bdclick5`.`bdnc`.`factura` = `bdclick5`.`bdverificadorfacturas`.`factura`))) group by `bdclick5`.`bdverificadorfacturas`.`total`,`bdclick5`.`bdverificadorfacturas`.`factura`,`bdclick5`.`bdverificadorfacturas`.`factura`
mariadb-version=100135
