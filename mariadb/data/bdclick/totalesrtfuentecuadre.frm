TYPE=VIEW
query=(select `bdclick`.`bdfactura`.`red` AS `red`,count(`bdclick`.`bdfactura`.`rtFuente`) AS `CuentaDertFuente`,sum(`bdclick`.`bdfactura`.`rtFuente`) AS `SumaDertFuente` from `bdclick`.`bdfactura` where (`bdclick`.`bdfactura`.`rtFuente` > 0) group by `bdclick`.`bdfactura`.`red`)
md5=f0b649e2e81c0a370ecce096c11d90a3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=(select `bdfactura`.`red` AS `red`,count(`bdfactura`.`rtFuente`) AS `CuentaDertFuente`,sum(`bdfactura`.`rtFuente`) AS `SumaDertFuente` from `bdfactura` where (`bdfactura`.`rtFuente` > 0) group by `bdfactura`.`red`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdfactura`.`red` AS `red`,count(`bdclick`.`bdfactura`.`rtFuente`) AS `CuentaDertFuente`,sum(`bdclick`.`bdfactura`.`rtFuente`) AS `SumaDertFuente` from `bdclick`.`bdfactura` where (`bdclick`.`bdfactura`.`rtFuente` > 0) group by `bdclick`.`bdfactura`.`red`)
mariadb-version=100135