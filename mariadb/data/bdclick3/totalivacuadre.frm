TYPE=VIEW
query=(select `bdclick3`.`bdfactura`.`red` AS `red`,sum(`bdclick3`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`red`)
md5=9e8ac8fdf0d11d38b531bafbabe2c620
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=(select `bdfactura`.`red` AS `red`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdfactura` group by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdfactura`.`red` AS `red`,sum(`bdclick3`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick3`.`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`red`)
mariadb-version=100135
