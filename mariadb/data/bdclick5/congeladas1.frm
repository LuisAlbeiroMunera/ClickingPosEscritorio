TYPE=VIEW
query=select `bdclick5`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick5`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick5`.`bdcongelada`.`totalGeneral` AS `totalGeneral` from `bdclick5`.`bdcongelada` group by `bdclick5`.`bdcongelada`.`idFactura`
md5=e3d30752cec8b48ac094058e12c49730
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:45
create-version=2
source=select `bdcongelada`.`idFactura` AS `idFactura`,`bdcongelada`.`conseMesa` AS `conseMesa`,`bdcongelada`.`totalGeneral` AS `totalGeneral` from `bdcongelada` group by `bdcongelada`.`idFactura`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcongelada`.`idFactura` AS `idFactura`,`bdclick5`.`bdcongelada`.`conseMesa` AS `conseMesa`,`bdclick5`.`bdcongelada`.`totalGeneral` AS `totalGeneral` from `bdclick5`.`bdcongelada` group by `bdclick5`.`bdcongelada`.`idFactura`
mariadb-version=100135
