TYPE=VIEW
query=(select `bdclick3`.`bdfactura`.`red` AS `red`,count(`bdclick3`.`bdfactura`.`rtFuente`) AS `CuentaDertFuente`,sum(`bdclick3`.`bdfactura`.`rtFuente`) AS `SumaDertFuente` from `bdclick3`.`bdfactura` where (`bdclick3`.`bdfactura`.`rtFuente` > 0) group by `bdclick3`.`bdfactura`.`red`)
md5=02dd147bac12b54f914106cefd8a7d87
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=(select `bdfactura`.`red` AS `red`,count(`bdfactura`.`rtFuente`) AS `CuentaDertFuente`,sum(`bdfactura`.`rtFuente`) AS `SumaDertFuente` from `bdfactura` where (`bdfactura`.`rtFuente` > 0) group by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdfactura`.`red` AS `red`,count(`bdclick3`.`bdfactura`.`rtFuente`) AS `CuentaDertFuente`,sum(`bdclick3`.`bdfactura`.`rtFuente`) AS `SumaDertFuente` from `bdclick3`.`bdfactura` where (`bdclick3`.`bdfactura`.`rtFuente` > 0) group by `bdclick3`.`bdfactura`.`red`)
mariadb-version=100135
