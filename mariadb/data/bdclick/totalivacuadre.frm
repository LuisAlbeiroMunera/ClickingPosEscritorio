TYPE=VIEW
query=(select `bdclick`.`bdfactura`.`red` AS `red`,sum(`bdclick`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`red`)
md5=69488f71175d56f4cb2b95e41882d104
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=(select `bdfactura`.`red` AS `red`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdfactura` group by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdfactura`.`red` AS `red`,sum(`bdclick`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick`.`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdclick`.`bdfactura` group by `bdclick`.`bdfactura`.`red`)
mariadb-version=100135
