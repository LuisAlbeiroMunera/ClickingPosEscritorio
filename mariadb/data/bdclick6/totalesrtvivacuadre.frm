TYPE=VIEW
query=(select `bdclick6`.`bdfactura`.`red` AS `red`,count(`bdclick6`.`bdfactura`.`rtIva`) AS `CuentaDertIva`,sum(`bdclick6`.`bdfactura`.`rtIva`) AS `SumaDertIva` from `bdclick6`.`bdfactura` where (`bdclick6`.`bdfactura`.`rtIva` > 0) group by `bdclick6`.`bdfactura`.`red`)
md5=96519c365586aea36d389ab079ffc391
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:39
create-version=2
source=(select `bdfactura`.`red` AS `red`,count(`bdfactura`.`rtIva`) AS `CuentaDertIva`,sum(`bdfactura`.`rtIva`) AS `SumaDertIva` from `bdfactura` where (`bdfactura`.`rtIva` > 0) group by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdfactura`.`red` AS `red`,count(`bdclick6`.`bdfactura`.`rtIva`) AS `CuentaDertIva`,sum(`bdclick6`.`bdfactura`.`rtIva`) AS `SumaDertIva` from `bdclick6`.`bdfactura` where (`bdclick6`.`bdfactura`.`rtIva` > 0) group by `bdclick6`.`bdfactura`.`red`)
mariadb-version=100135