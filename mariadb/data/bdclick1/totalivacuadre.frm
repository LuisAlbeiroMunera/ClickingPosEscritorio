TYPE=VIEW
query=(select `bdclick1`.`bdfactura`.`red` AS `red`,sum(`bdclick1`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`red`)
md5=a7d1d38962564fe79b1de85daead0cdf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=(select `bdfactura`.`red` AS `red`,sum(`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdfactura` group by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdfactura`.`red` AS `red`,sum(`bdclick1`.`bdfactura`.`iva`) AS `SumaDeiva`,sum(`bdclick1`.`bdfactura`.`subtotal`) AS `SumaDesubtotal` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`red`)
mariadb-version=100135