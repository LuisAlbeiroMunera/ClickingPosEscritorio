TYPE=VIEW
query=select `bdclick3`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick3`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick3`.`bdcongelada`.`totalGeneral` AS `totalGeneral` from `bdclick3`.`bdcongelada` group by `bdclick3`.`bdcongelada`.`idFactura`
md5=567ff510c5c8a915af29ff8ac854df63
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select `bdcongelada`.`idFactura` AS `idFactura`,`bdcongelada`.`conseMesa` AS `conseMesa`,`bdcongelada`.`totalGeneral` AS `totalGeneral` from `bdcongelada` group by `bdcongelada`.`idFactura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick3`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick3`.`bdcongelada`.`totalGeneral` AS `totalGeneral` from `bdclick3`.`bdcongelada` group by `bdclick3`.`bdcongelada`.`idFactura`
mariadb-version=100135
